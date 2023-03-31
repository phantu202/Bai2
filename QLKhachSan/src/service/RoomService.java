package service;

import java.util.ArrayList;

import file.MyFile;
import model.Room;

public class RoomService {
	public static ArrayList<Room> listRooms= new ArrayList<>();
	private static final String fileName = "roomxjk.txt";
	MyFile myFile = new MyFile();
	
	

//	public void start() {
//		if (listRooms == null) {
//			listRooms = new ArrayList<>();
//			listRooms.add(new Room(1, "Đôi", false, 0));
//			listRooms.add(new Room(2, "Đơn", true, 1));
//			listRooms.add(new Room(3, "King", false, 0));
//			listRooms.add(new Room(4, "Queen", true, 2));
//
//		}
//	}

	public void createRoom(Room room){
		
		boolean cond = true;
		for (Room room1 : listRooms) {
			if (room1.getNumbRoom() == room.getNumbRoom()) {
				System.out.println("Số phòng đã tồn tại");
				cond = false;
				break;
			}
		}
		if (cond) {
			listRooms.add(room);
			myFile.output(listRooms, fileName);
		}
	}

	public void readAllRoom() {
		
		listRooms =  (ArrayList<Room>) myFile.docFile(fileName);
		for (Room room : listRooms) {
			System.out.println(room.toString());
		}
	}

	public void updateRoom(Room room) {
		readAllRoom();
		boolean cond = true;
		for (Room room1 : listRooms) {
			if (room1.getNumbRoom() == room.getNumbRoom()) {
				room1.setKindOfRoomString(room.getKindOfRoomString());
				room1.setTenantsID(room.getTenantsID());
				if (room1.getTenantsID() != 0) {
					room1.setRoomStatus(true);
				} else {
					room1.setRoomStatus(false);
				}
				cond = false;
				break;
			}

		}
		if (cond) {
			System.out.println("Số phòng không tồn tại");
		}

	}

	public void deleteRoom(int numbRoom) {
		readAllRoom();

		boolean cond = true;
		for (Room room : listRooms) {
			if (room.getNumbRoom() == numbRoom) {
				listRooms.remove(room);
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại số phòng này");
		}

	}

	public void findRoom(int numbRoom) {
		readAllRoom();
		for (Room room : listRooms) {
			if (room.getNumbRoom() == numbRoom) {
				System.out.println(room.toString());
			}
		}
	}

	public void bookRoom(int numbRoom, int tenantsID) {
		readAllRoom();
		boolean cond = true;
		for (Room room : listRooms) {
			if (room.getNumbRoom() == numbRoom) {
				if (room.getTenantsID() == 0) {
					room.setTenantsID(tenantsID);
					room.setRoomStatus(true);
					System.out.println("Khách id " + tenantsID + " đã đặt được phòng số " + numbRoom);
				} else {
					System.out.println("Phòng này đã có khách đặt");
				}
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại phòng này");
		}
	}

	public void checkRoom(int numbRoom) {
		readAllRoom();
		boolean cond = true;
		for (Room room : listRooms) {
			if (room.getNumbRoom() == numbRoom) {
				if (room.getRoomStatus() == true) {
					room.setRoomStatus(false);
					room.setTenantsID(0);
					System.out.println("Trả phòng thành công");
				} else {
					System.out.println("Phòng đang trống");
				}
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại phòng này");
		}
	}

	public void findEmtyRoom() {
		readAllRoom();
		for (Room room : listRooms) {
			if (room.getRoomStatus() == false) {
				System.out.println(room.toString());
			}
		}
	}

	public void findRentedRoom() {
		readAllRoom();
		for (Room room : listRooms) {
			if (room.getRoomStatus() == true) {
				System.out.println(room.toString());
			}
		}
	}

}
