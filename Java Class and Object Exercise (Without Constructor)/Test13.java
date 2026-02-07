/*
 * 13. Hotel Room Booking
• Create a Room class with fields: roomNumber, isBooked, pricePerNight, nightsBooked.
• Add methods:
o bookRoom(int nights) → set booked status and nights.
o calculateBill() → returns pricePerNight * nightsBooked.
• In main, create multiple rooms, book them, and display bills.
 */


 class Room{
    int roomNumber;
    boolean isBooked ;
    double pricePerNight;
    int nightsBooked;

    void bookRoom(int nights){
        if(!isBooked){
            isBooked = true ;
            nightsBooked = nights ;
            System.out.println("Room "+roomNumber + " booked for "+ nights + " nights.");
        }
        else{
            System.out.println("Room "+ roomNumber + " is already booked.");
        }
    }

    double calculateBill(){
        if(isBooked){
            return pricePerNight*nightsBooked ;
        }
        else{
            return 0 ;
        }
    }

 }
public class Test13 {
    public static void main(String[] args) {
        
        //Create Room Objects
        Room room1 = new Room();
        room1.roomNumber = 101 ;
        room1.pricePerNight = 2000 ;

        Room room2 = new Room();
        room2.roomNumber = 102 ;
        room2.pricePerNight = 2500 ;

        room1.bookRoom (3); //book for 3 nights
        room2.bookRoom (2); //book for 2 nights

        System.out.println("Bill for Room "+room1.roomNumber + ": "+room1.calculateBill());
        System.out.println("Bill for Room "+room2.roomNumber + ": "+room2.calculateBill());

    }
    
}

/*
Room 101 booked for 3 nights.
Room 102 booked for 2 nights.
Bill for Room 101: 6000.0
Bill for Room 102: 5000.0
 */