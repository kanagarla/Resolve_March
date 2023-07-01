package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SplitString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url=new URL("https://www.facebook.com/tr/?id=255813999377376&"
				+ "ev=ViewContent&dl=https://www.stg.getketch.com/"
				+ "product/ketch-men-grey-slim-fit-casual-shirt-khsh001258.html"
				+ "&rl=https://www.stg.getketch.com/category/"
				+ "ketch-jeans-x-rishabh-pant.html&if=false&ts=1677713150564&"
				+ "cd[content_ids]=[\"8905745446750\"]&cd[content_category]="
				+ "All Brands&cd[content_name]=Ketch Men Grey Slim Fit Casual Shirt&"
				+ "cd[content_type]=product&cd[contents]=[{\"id\":\"8905745446750\","
				+ "\"quantity\":1,\"item_price\":877}]&cd[currency]=INR&cd[value]=877&"
				+ "sw=1536&sh=1024&ud[external_id]=187259e5098e8860b2fec67b5a2f8a37c"
				+ "e8e6fbb34459bd9b63ab8920f8afa44&v=2.9.97&r=stable&ec=1&o=30&"
				+ "fbp=fb.1.1665395032304.130814121&it=1677713149433&coo=false&"
				+ "eid=lPPv6tYSSrpdd6CrAfg1L&rqm=GET");
		
		System.out.println(url.getQuery());
		/*String[] parsedUrl = url.split("\\/");
		System.out.println(parsedUrl[4]); */
	}

}
