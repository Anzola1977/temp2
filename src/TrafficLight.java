public class TrafficLight {
    public static void main(String[] args) {
        String colorTrafficLight1 = "green";
        String colorTrafficLight2 = "red";
        String colorTrafficLight3 = "yellow";
        System.out.println(lighting(colorTrafficLight2)); //+ " " + lighting(colorTrafficLight2) + " " + lighting(colorTrafficLight3));
    }

    public static String lighting(String colorTrafficLight) {
        String result = "";

        switch (colorTrafficLight) {
            case "green":
                result = "You can drive!";
                break;
            case "red":
                result = "You must stop!";
                break;
            case "yellow":
                result = "You must wait!";
                break;
            default:
                result = "traffic light not working";
        }
        return result;
    }
}