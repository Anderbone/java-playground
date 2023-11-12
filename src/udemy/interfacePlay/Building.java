package udemy.interfacePlay;

public class Building implements Mappable{

	@Override
	public String label() {
		return null;
	}

	@Override
	public GeoType geoType() {
		return GeoType.POINT;
	}

	@Override
	public IconType iconType() {
		return null;
	}
}
