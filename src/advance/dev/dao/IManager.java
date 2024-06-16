package advance.dev.dao;

import advance.dev.model.CanBo;

public interface IManager {
	void add(CanBo cb);
	void print();
	void sortByName(int order);
}
