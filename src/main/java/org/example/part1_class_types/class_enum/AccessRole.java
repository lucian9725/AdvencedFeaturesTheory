package org.example.part1_class_types.class_enum;

public enum AccessRole {
    // obiecte constante de tipul AccessRole (optional) - constante prestabilite
    ADMIN("All Access", 3),
    MODERATOR("Moderate Access", 2),
    USER("Read-only Access", 1);

    // atribute ale unui obiect constant
    private final String accessLevel;
    private final int priority;

    // constructor
    AccessRole(String accessLevel, int priority) {
        this.accessLevel = accessLevel;
        this.priority = priority;
    }

    // getter
    public String getAccessLevel() {
        return accessLevel;
    }

    public int getPriority() {
        return priority;
    }
}
