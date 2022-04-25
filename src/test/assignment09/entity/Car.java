package test.assignment09.entity;

public class Car {
    private String name;
    private String type;
    public class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
