package udemy.interfacePlay;

public interface Mappable {
	
	public static final String JSON_PROPERTY = "properties:{%s}";
	String label();
	GeoType geoType();
	IconType iconType();

	default void toJSON(){
	    System.out.println();
	}

	static void printBusiness(Business business, Mappable inMappable){
		inMappable.toJSON();
		business.printBusiness();
	}
}
