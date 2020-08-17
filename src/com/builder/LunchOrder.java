package com.builder;

public class LunchOrder {
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressign;
        private String meat;

        public Builder(){

        }
        public LunchOrder build(){
            return new LunchOrder(this);
        }
        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder dressign(String dressign){
            this.dressign = dressign;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressign;
    private final String meat;


    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressign = builder.dressign;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressign() {
        return dressign;
    }

    public String getMeat() {
        return meat;
    }

}
