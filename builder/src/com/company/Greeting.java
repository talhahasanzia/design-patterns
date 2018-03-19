package com.company;

/**
 * Created by Talha Hasan Zia on 19-Mar-18.
 * <p></p><b>Description:</b><p></p> Sample greeting class which returns object with respect to the input.
 * <p></p>
 */
public class Greeting {

    private Gender gender;
    private String name;

    // notice private constructor
    private Greeting(Builder builder) {
        this.gender=builder.gender;
        this.name=builder.name;
    }

    // do greeting
    public String greet()
    {
        if(gender==Gender.MALE)
        {
            return "Hello, Mr."+name;
        }
        else
        {
            return "Hello, Ms."+name;
        }
    }

    //  notice static modifier
    public static class Builder {
        private Gender gender;
        private String name;

        // if there is a required parameter, builder's constructor must have it.
        public Builder() {

        }


        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Greeting build() {
            return new Greeting(this);
        }

    }
}
