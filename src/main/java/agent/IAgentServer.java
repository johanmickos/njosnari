package agent;

import common.Footprint;

import java.net.InetAddress;
import java.util.Vector;

public interface IAgentServer
{
    /**
       The agent wants to be sent to inetAddr and port.
       Parameters:
       agent.Agent agent          - reference to an agent object ("this")
       InetAddress dstAddr  - destination address
       int dstPort          - destination port
    */
    void agentMigrate(Agent agent, InetAddress dstAddr, int dstPort);

    /**
     * Information about agents that visited the server (home node and what node it was sent to).
     */
    Vector<Footprint> getFootprints();

    /**
     * Get list of agents that are currently residing at the server
     */
    Vector<Agent> getResidingAgents();
}
