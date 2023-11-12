package udemy.interfacePlay;

public class UtilityLine implements Mappable {
	@Override
	public String label() {
		return null;
	}

	@Override
	public GeoType geoType() {
		return GeoType.LINE;
	}

	@Override
	public IconType iconType() {
		return null;
	}
}
