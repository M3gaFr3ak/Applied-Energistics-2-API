package appeng.api.implementations;

import appeng.api.networking.IGridHost;
import appeng.api.parts.IBusPart;

/**
 * Implemented by all screen like parts provided by AE.
 */
public interface IPartMonitor extends IBusPart, IGridHost
{

	/**
	 * @return if the device is online you should check this before providing
	 *         any other information.
	 */
	boolean isPowered();

}