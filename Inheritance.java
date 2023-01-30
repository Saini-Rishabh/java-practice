class Room {
    int length;
    int breadth;

    Room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return (length * breadth);
    }
}

class Bedroom extends Room {
    int height;

    Bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);
    }
}

class Inheritance {
    public static void main(String k[]) {
        Bedroom room1 = new Bedroom(10, 20, 30);
        int Area1 = room1.area();
        int volume1 = room1.volume();
        System.out.println("Area=" + Area1);
        System.out.println("Volume=" + volume1);

    }
}