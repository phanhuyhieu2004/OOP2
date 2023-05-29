public class People {
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;

    public People() {
    }

    public People(String name, int age, String sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "Tên='" + name + '\'' +
                ", Tuổi=" + age +
                ", Gioi tính='" + sex + '\'' +
                ", Chiều cao=" + height +
                ", Cân nặng=" + weight +
                '}';
    }
}

    class Teacher extends People {
        private String level;
        private int experience;
        private String subject;

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Teacher() {
            super();
        }


        public Teacher(String name, int age, String sex, double height, double weight, String level, int experience, String subject) {
            super(name, age, sex, height, weight);
            this.level = level;
            this.experience = experience;
            this.subject = subject;
        }

        @Override
        public String toString() {
            return super.toString() + ", Level: " + level + ", Experience: " + experience + ", Subject: " + subject;
        }
    }












