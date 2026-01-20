package com.ishan.design_patterns.structural.flyweight.game_example;

public class FlyweightPatternClientDemo {

    public static void main(String[] args) {
        FlyweightRegistry registry = new FlyweightRegistryImpl();
        UserIntrinsicState user1 =
                new UserIntrinsicState("User 1", 30, "Male", "user1@email", "99999", null);
        UserIntrinsicState user2 =
                new UserIntrinsicState("User 2", 33, "Male", "user2@email", "88888", null);

        registry.addFlyweight(user1);
        registry.addFlyweight(user2);

        UserIntrinsicState userObject = registry.getFlyweight("user1@email");
        UserExtrinsicState userObjectMatch1 = new UserExtrinsicState(Colour.BLACK, 1, userObject);
        UserExtrinsicState userObjectMatch2 = new UserExtrinsicState(Colour.WHITE, 2, userObject);
    }
}
