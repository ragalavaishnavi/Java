# Javapublic class Device {
    // Start method
    public void start() {
        System.out.println("Device started.");
    }

    // Perform an operation, throws Exception if task is invalid
    public void performOperation(String task) throws Exception {
        if (task == null || task.isEmpty()) {
            throw new Exception("Invalid operation: task cannot be empty.");
        }
        System.out.println("Performing operation: " + task);
    }

    // Main method (entry point)
    public static void main(String[] args) {
        Device device = new Device();

        try {
            device.start();  // Start the device

            device.performOperation("Read Data");   // Works fine
            device.performOperation("");            // This will throw exception

        } catch (Exception e) {
            System.out.println("Operation Error: " + e.getMessage());
        } finally {
            System.out.println("Shutting down simulation... (cleanup done)");
        }
    }
}
