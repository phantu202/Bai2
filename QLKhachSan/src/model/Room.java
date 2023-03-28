package model;

public class Room {
	private int numbRoom;
	private String kindOfRoomString;
	private boolean roomStatus;
	private int tenantsID;

	public int getNumbRoom() {
		return numbRoom;
	}

	public void setNumbRoom(int numbRoom) {
		this.numbRoom = numbRoom;
	}

	public String getKindOfRoomString() {
		return kindOfRoomString;
	}

	public void setKindOfRoomString(String kindOfRoomString) {
		this.kindOfRoomString = kindOfRoomString;
	}

	public boolean getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getTenantsID() {
		return tenantsID;
	}

	public void setTenantsID(int tenantsID) {
		this.tenantsID = tenantsID;
	}

	public Room(int numbRoom, String kindOfRoomString, int tenantsID) {
		this.numbRoom = numbRoom;
		this.kindOfRoomString = kindOfRoomString;
		this.tenantsID = tenantsID;
	}

	public Room() {
	}

	@Override
	public String toString() {
		return "Room [numbRoom=" + numbRoom + ", kindOfRoomString=" + kindOfRoomString + ", roomStatus=" + roomStatus
				+ ", tenantsID=" + tenantsID + "]";
	}

	public Room(int numbRoom, String kindOfRoomString, boolean roomStatus, int tenantsID) {
		this.numbRoom = numbRoom;
		this.kindOfRoomString = kindOfRoomString;
		this.roomStatus = roomStatus;
		this.tenantsID = tenantsID;
	}
	
}
