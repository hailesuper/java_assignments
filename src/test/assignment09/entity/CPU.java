package test.assignment09.entity;

public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public class Processor {
        private byte coreAmount;
        private String manufacturer;
        public double getCache() {
            return 4.3;
        }

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = (byte) coreAmount;
            this.manufacturer = manufacturer;
        }
    }

    public class Ram {
        private byte memory;
        private String manufacturer;
        public double getClockSpeed() {
            return 5.5;
        }

        public Ram(int memory, String manufacturer) {
            this.memory = (byte) memory;
            this.manufacturer = manufacturer;
        }
    }
}
