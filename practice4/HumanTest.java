package practice4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Blue");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(true);
        Hand rightHand = new Hand(false);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Eye Color: " + person.getHead().getEyeColor());
        System.out.println("Left Leg Length: " + person.getLeftLeg().getLength());
        System.out.println("Right Leg Length: " + person.getRightLeg().getLength());
        System.out.println("Is Left Handed: " + person.getLeftHand().isLeftHanded());
        System.out.println("Is Right Handed: " + person.getRightHand().isLeftHanded());

        person.getHead().setEyeColor("Green");
        person.getLeftLeg().setLength(85);
        person.getRightHand().setLeftHanded(true);

        System.out.println("New Eye Color: " + person.getHead().getEyeColor());
        System.out.println("New Left Leg Length: " + person.getLeftLeg().getLength());
        System.out.println("New Is Left Handed: " + person.getLeftHand().isLeftHanded());
    }
}
