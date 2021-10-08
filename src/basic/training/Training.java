package basic.training;

class Training {
    public static void main(String[] args) {
        TrainingDatabase tdb1 = new TrainingDatabase("0001",
                "Anzu Tamaki","002-0853","札幌市北区屯田","女性");
        TrainingDatabase tdb2 = new TrainingDatabase("0002",
                "Kazuyo Tamaki","002-0853","札幌市北区屯田","女性");
        TrainingDatabase tdb3 = new TrainingDatabase("0001",
                "Chataro Tamaki","002-0853","札幌市北区屯田","男性");

        System.out.println(tdb1.getMembershipNumber());
        System.out.println(tdb1.getName());

        tdb3.setMembershipNumber("0000");
        System.out.println(tdb3.getMembershipNumber());

    }
}
