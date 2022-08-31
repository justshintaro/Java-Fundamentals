package labs_examples.objects_classes_methods.labs.objects;

class Exercise3 {
    public static void main(String[] args){
        Hours hours = new Hours(7);
        Date date = new Date("11/14");
        System.out.println("On "+date.date+ ", I worked "+hours.hours+" (two association)");

        Work work = new Work(true);
        System.out.println("On "+date.date+ ", I worked "+hours.hours+" hours although that day was my work day = "+work.work+" (three association)");

    }
}


class Work {
    boolean work;
    public Work(boolean work) {
        this.work = work;
    }
}

class Hours {
    double hours;
    public Hours(double hours) {
        this.hours = hours;
    }
}

class Date {
    String date;
    public Date(String date) {
        this.date = date;
    }
}