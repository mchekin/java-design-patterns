package com.mchekin.designpatterns.builder.basic;

public class Equipment {
    private final String head;
    private final String torso;
    private final String legs;
    private final String mainHand;
    private final String offhand;
    private final String hip;

    public static class Builder {
        private String head;
        private String torso;
        private String legs;
        private String mainHand;
        private String offhand;
        private String hip;

        public Equipment build() {
            return new Equipment(this);
        }

        public Builder setHead(String head) {
            this.head = head;

            return this;
        }

        public Builder setTorso(String torso) {
            this.torso = torso;

            return this;
        }

        public Builder setLegs(String legs) {
            this.legs = legs;

            return this;
        }

        public Builder setMainHand(String mainHand) {
            this.mainHand = mainHand;

            return this;
        }

        public Builder setOffhand(String offhand) {
            this.offhand = offhand;

            return this;
        }

        public Builder setHip(String hip) {
            this.hip = hip;

            return this;
        }
    }

    private Equipment(Builder builder) {
        this.head = builder.head;
        this.torso = builder.torso;
        this.legs = builder.legs;
        this.mainHand = builder.mainHand;
        this.offhand = builder.offhand;
        this.hip = builder.hip;
    }

    public String getHead() {
        return head;
    }

    public String getTorso() {
        return torso;
    }

    public String getLegs() {
        return legs;
    }

    public String getMainHand() {
        return mainHand;
    }

    public String getOffhand() {
        return offhand;
    }

    public String getHip() {
        return hip;
    }
}
