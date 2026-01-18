package com.ishan.design_patterns.creational.singleton.usecase.connectionpool;

/**
 * Contract for a connection pool.
 *
 * Responsibilities:
 * - Initialize a fixed-size pool of connections
 * - Provide thread-safe access to connections
 * - Allow releasing connections back to the pool
 */
public interface ConnectionPool {

    /**
     * Initializes the connection pool.
     * Typically called during singleton initialization.
     */
    void initializePool();

    /**
     * Retrieves a connection from the pool.
     * Blocks if no connection is available.
     */
    DatabaseConnection getConnection();

    /**
     * Releases a connection back to the pool.
     */
    void releaseConnection(DatabaseConnection connection);

    /**
     * @return number of currently available connections
     */
    int getAvailableConnectionsCount();

    /**
     * @return total connections managed by the pool
     */
    int getTotalConnectionsCount();
}
