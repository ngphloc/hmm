/**
 * 
 */
package net.zebra.hmm;

import java.util.List;


/**
 * @author Loc Nguyen
 * @version 1.0
 *
 */
public abstract class AtomicDistribution implements Distribution {

	
	/**
	 * 
	 */
	public AtomicDistribution() {
		super();
	}
	
	
	/**
	 * 
	 * @param O
	 * @param glist
	 */
	public abstract void learn(List<Obs> O, List<Double> glist);
}
