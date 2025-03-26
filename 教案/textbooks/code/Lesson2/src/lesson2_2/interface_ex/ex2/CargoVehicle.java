package lesson2_2.interface_ex.ex2;

/**
 * 貨物車インターフェイス
 */
public interface CargoVehicle extends Vehicle{
	//車インタフェースの内容をこのインタフェースで実装はしなくてよい
	//実装先のクラスで、4つのメソッドのオーバーライドを行う
	/**　積み込み　*/
	void loading(Object cargo);

	/**　荷下ろし　*/
	Object unloading();
}