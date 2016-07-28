import java.util.HashMap;
import java.util.Map;


public class moa {
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	private int productId;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Map<String,Object> map = new HashMap<String, Object>();
		map.put("key", "val");
		
		System.out.println(map);
		Map<String,Object> basMap = new HashMap<String,Object>(map);
		basMap.put("BasFlag", true);

		basMap.put("1","2");
		System.out.println(map);
		if (map.get("key").equals("key")) {
			System.out.print(map);
			b
		}

		System.out.println(basMap);


	}

}
