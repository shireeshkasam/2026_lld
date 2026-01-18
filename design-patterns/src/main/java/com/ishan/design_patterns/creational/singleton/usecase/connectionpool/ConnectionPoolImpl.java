package com.ishan.design_patterns.creational.singleton.usecase.connectionpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Singleton-based implementation of a connection pool.
 * <p>
 * Design Patterns used:
 * - Singleton (one pool per application)
 * - Object Pool (reuse expensive objects)
 * <p>
 * Thread-safety:
 * - BlockingQueue ensures safe concurrent access
 */
public class ConnectionPoolImpl implements ConnectionPool {

    /**
     * Singleton instance of the connection pool.
     */
    private static volatile ConnectionPool instance;

    /**
     * Maximum number of connections allowed in the pool.
     */
    private final int maxConnections;

    /**
     * Thread-safe queue holding available connections.
     */
    private final BlockingQueue<DatabaseConnection> connectionQueue;

    /**
     * Private constructor prevents direct instantiation.
     */
    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        this.connectionQueue = new ArrayBlockingQueue<>(maxConnections);
        initializePool();
    }

    /**
     * Returns the singleton instance of the connection pool.
     */
    public static ConnectionPool getInstance(int maxConnections) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }
        return instance;
    }

    /**
     * Resets the singleton instance.
     * <p>
     * Used mainly for:
     * - Testing
     * - Demonstration purposes
     * <p>
     * ❌ Should never exist in production singletons.
     */
    public static void resetInstance() {
        instance = null;
    }

    /**
     * Initializes the pool with pre-created connections.
     */
    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            DatabaseConnection connection = createConnection();
            connectionQueue.offer(connection);
        }
    }

    /**
     * Factory method to create a new database connection.
     */
    private DatabaseConnection createConnection() {
        return new DatabaseConnection();
    }

    /**
     * Retrieves a connection from the pool.
     * <p>
     * Blocks if no connection is available.
     */
    @Override
    public DatabaseConnection getConnection() {
        try {
            return connectionQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error getting connection from pool", e);
        }
    }

    /**
     * Releases a connection back to the pool.
     */
    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if (connection != null) {
            connectionQueue.offer(connection);
        }
    }

    /**
     * @return number of currently available connections
     */
    @Override
    public int getAvailableConnectionsCount() {
        return connectionQueue.size();
    }

    /**
     * @return total number of connections managed by the pool
     */
    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}
