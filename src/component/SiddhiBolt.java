package component;

import org.apache.log4j.Logger;
import org.wso2.siddhi.core.SiddhiManager;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

// This class is like a bolt and uses Siddhi to handle CEP.

public class SiddhiBolt extends BaseBasicBolt {
	
	private transient Logger log = Logger.getLogger(SiddhiBolt.class);
	private transient SiddhiManager siddhimanager;
	
	//Exported stream Ids.
	private String[] exportedStreamIds;
	
	//Stream definitions need to be done here.
	private String[] definitions;

	//Queries to be executed using Siddhi
	
	/**
	 * Bolt which runs teh siddhi Engine
	 * @param definitions - Stream definitions
	 * @param queries - Siddhi queries
	 * @param exportedSiddhiStreamIds - Export stream names
	 * 
	 */
	
	 public SiddhiBolt(String[] definitions, String[] queries, String[] exportedSiddhiStreamIds)
	 {
		 
	 }
	 
	@Override
	public void execute(Tuple arg0, BasicOutputCollector arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
