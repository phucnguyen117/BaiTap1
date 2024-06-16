package advance.dev.dao;

import java.util.ArrayList;
import java.util.List;

import advance.dev.model.CanBo;

public class Manager implements IManager {

	//Sap xep danh sach can bo
	public static final int ASC = 1;
	public static final int DESC = -1;
	private List<CanBo> canboList = new ArrayList<CanBo>();

	@Override
	public void add(CanBo cb) {
		// TODO Auto-generated method stub
		canboList.add(cb);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (CanBo canBo : canboList) {
			System.out.println(canBo);
		}
	}

	@Override
	public void sortByName(int order) {
		// TODO Auto-generated method stub
		
	}
}
