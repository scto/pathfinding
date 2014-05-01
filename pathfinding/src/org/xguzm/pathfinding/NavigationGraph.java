package org.xguzm.pathfinding;

import java.util.List;

/**
 * A collection of {@link NavigationNode}.
 * 
 * @author Xavier Guzman
 *
 * @param <T> the type implementing {@link NavigationNode}
 */
public interface NavigationGraph<T extends NavigationNode> {
	/**
	 * Calls {@link #getNeighbors(node, PathFinderOptions)} with the default
	 * {@link PathFinderOptions}
	 */
	List<T> getNeighbors(T node);
	
	/**
	 * @return a list containing the adjacent nodes for {@link node}, using the passed options
	 */
	List<T> getNeighbors(T node, PathFinderOptions opt);
	
	/** Determines the movement cost for moving from node1 to node2, with the given options */
	float getMovementCost(T node1, T node2, PathFinderOptions opt);
	
	
	boolean isWalkable(T node );
	
}