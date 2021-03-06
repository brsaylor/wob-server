/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvg.net.response;

import shared.metadata.NetworkCode;
import lby.net.response.GameResponse;
import shared.util.GamePacket;

/**
 * ResponseConvergeHintCount returns # of hints in database
 * @author justinacotter
 */
public class ResponseConvergeBetUpdate extends GameResponse {

    private short roundComplete = 0;     // 1 = all players bet, round complete
    private short won = 0;               // 1 = player won round
    private short round;
    private int wonAmount = 0;
    private int bestPlayer_id;
    
    public ResponseConvergeBetUpdate() {
        response_id = NetworkCode.MC_BET_UPDATE;
    }

    public void setRoundComplete (short roundComplete) {
        this.roundComplete = roundComplete;
    }
    
    public void setWon (short won) {
        this.won = won;
    }
    
    public void setRound (short round) {
        this.round = round;
    }
    
    public void setWonAmount (int wonAmount) {
        this.wonAmount = wonAmount; 
    }
    
    public void setWinner(int bestPlayer_id) {
        this.bestPlayer_id = bestPlayer_id;
    }

    @Override
    public byte[] getBytes() {
        GamePacket packet = new GamePacket(response_id);

        packet.addShort16(roundComplete);
        packet.addShort16(won);
        packet.addShort16(round);
        packet.addInt32(wonAmount);
        packet.addInt32(bestPlayer_id);

        return packet.getBytes();
    }
}
