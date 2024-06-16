package advance.dev;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		themDanhSachCanBo(manager);
		
		//In danh sach can bo
		manager.print();
		
		//Sap xep tang dan
		manager.sortByName(Manager.ASC);
		manager.print();

		//Sap xep giam dan
		manager.sortByName(Manager.DESC);
		manager.print();
	}

	private static void themDanhSachCanBo(IManager manager) {
		// TODO Auto-generated method stub
		
	}

}
