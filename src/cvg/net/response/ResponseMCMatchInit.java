package cvg.net.response;

import shared.metadata.NetworkCode;
import lby.net.response.GameResponse;
import shared.util.GamePacket;


public class ResponseMCMatchInit extends GameResponse {

	private int matchID;
	private short status;
	
	public ResponseMCMatchInit() {
		response_id = NetworkCode.MC_MATCH_INIT;
	}
	

	@Override
	public byte[] getBytes() {

        GamePacket packet = new GamePacket(response_id);
        packet.addShort16(status);
        packet.addInt32(matchID);
        
		return packet.getBytes();
	}

	public void setMatchID(int matchID){
		this.matchID = matchID;
	}
	
	public void setStatus(short status){
		this.status = status;
	}
}
