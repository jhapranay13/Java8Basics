package javaEight.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompareMapsUsingStreams {

	public static void main(String[] args) {
		List< Map< String, String > > records = new ArrayList<>();
		Map< String, String > record = new HashMap<String, String>();
		record.put( "id" , "23" );
		record.put( "name" , "Ram" );
		record.put( "desc" , "Some Desc" );
		records.add( record );
		record = new HashMap<String, String>();
		record.put( "id" , "22" );
		record.put( "name" , "Rama" );
		record.put( "desc" , "Some Desc1" );
		records.add( record );
		record = new HashMap<String, String>();
		record.put( "id" , "22" );
		record.put( "name" , "Raman" );
		record.put( "desc" , "Some Desc1" );
		records.add( record );
		
		Map< String, String > param = new HashMap<String, String>();
		param.put( "id" , "22" );
		param.put( "desc", "Some Desc1" );
		
		//List< Map< String, String > > filteredRecords = getFilteredData( records, param );
		List< String > filteredRecords = getFilteredDataColumn(records, param, "name");
		
		for( int i = 0 ; i < filteredRecords.size(); i++ ) {
			System.out.println( filteredRecords.get( i ) );
		}
	}

	private static List<Map<String, String>> getFilteredData(List<Map<String, String>> records,
			Map<String, String> param) {
		List< Map< String, String > > filteredRecords = new ArrayList<Map<String,String>>();
		
		filteredRecords = records.stream().filter(  (recordMap) -> { 
			boolean flag = param.entrySet().stream().allMatch( ( entry ) -> {
				return entry.getValue().trim().equals( recordMap.get( entry.getKey() ) );
			});
			return flag;
		}).collect( Collectors.toList() );
		return filteredRecords;
	}

	private static List< String > getFilteredDataColumn(List<Map<String, String>> records,
			Map<String, String> param, String returnColumn) {
		List< String > filteredRecords = new ArrayList<String>();
		
		filteredRecords = records.stream().filter(  (recordMap) -> { 
			boolean flag = param.entrySet().stream().allMatch( ( entry ) -> {
				return entry.getValue().trim().equals( recordMap.get( entry.getKey() ) );
			});
			return flag;
		}).map( ( recordMap ) -> recordMap.get( returnColumn ) ).collect(Collectors.toList());
		return filteredRecords;
	}
}
