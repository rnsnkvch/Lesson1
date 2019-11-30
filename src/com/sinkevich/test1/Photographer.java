package com.sinkevich.test1;

public class Photographer extends Person implements Photo {
    private String photo;
    private int number=0;

    public Photographer(String userName) {
        super(userName);
    }

    public Photographer(int age, String userName, boolean m) {
        super(age, userName, m);
    }

    public Photographer(int age) {
        super(age);
    }


    @Override
    public String getPhoto() {
        return photo;
    }

    @Override
    public void doPhoto() {
        photo="image" + number;
        number=number+1;

    }
}
