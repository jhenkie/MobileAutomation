package io.cucumber.skeleton;

public class Assets {

    public static class login {
        public static String invalidUsername = "johannes";
        public static String invalidPassword = "henkie";

        public static String validUsername = "admin";
        public static String validPassword = "admin";
        public static class errorLogin {
            public static String username = "Please fill in username";
            public static String password = "Please fill in password";
            public static String invalidUser = "Invalid login";
        }
    }

    public static class profile {
        public static String welcome = "Welcome to IOVIO!";
    }

    public static class about {
        public static String title = "IOVIO / ACCELERATE. VALIDATE. OPTIMIZE";
        public static String detail = "IOVIO is a fast growing, dynamic company with offices in the Netherlands the United Kingdom, Romania & Mexico. Known as industry experts in Quality Assurance, Test Automation and Performance Testing services, IOVIO solves complex business solutions for customers with our highly skilled consultants using technical and innovative solutions.\n" +
                "\n" +
                "As SAP services and technical partners, IOVIO works with some of the largest organizations in the world, on some of the most challenging IT projects.";
    }

    public static class location {
        public static String netherland = "IOVIO Netherlands (HQ)\n" +
                "Barbara Strozzilaan 201\n" +
                "1083HN, Amsterdam\n" +
                "The Netherlands";
        public static String USA = "IOVIO USA\n" +
                "600 Congress Ave. STE 1400\n" +
                "Austin, TX, 78701\n" +
                "United States";
        public static String romania = "IOVIO Romania\n" +
                "Ion Bogdan street no 23, 2nd Floor,\n" +
                "Sector no 1, 010539, Bucharest, \n" +
                "Romania";
        public static String mexico = "IOVIO Mexico\n" +
                "Edificio Sierra 206, Piso 6\n" +
                "Monterrey, N.L., 64750\n" +
                "Mexico";
    }

}
