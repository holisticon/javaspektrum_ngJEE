/**
 * Cordova Angular JEE7 Demo App
 *
 * File: AppInfo.java, 04.08.2014, 16:07:28, mreinhardt
 *
 * https://holisticon.de
 *
 * @project https://github.com/hypery2k/angular_cordova_app
 *
 * @copyright Holisticon AG 2014
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package de.mare.mobile.domain.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author mreinhardt
 *
 */
@XmlRootElement
public class AppInfo {

	private String hostname;

	private String freeMemory;

	public AppInfo() {

	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @param hostname
	 *          the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @return the freeMemory
	 */
	public String getFreeMemory() {
		return freeMemory;
	}

	/**
	 * @param freeMemory
	 *          the freeMemory to set
	 */
	public void setFreeMemory(String freeMemory) {
		this.freeMemory = freeMemory;
	}

}
