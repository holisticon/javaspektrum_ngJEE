/**
 * Cordova Angular JEE Demo App
 *
 * File: BasicJPATest.java, 30.07.2014, 17:01:38, mreinhardt
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
package de.holisticon.javaspektrum.ngjee.domain;

import javax.persistence.EntityManager;

import org.junit.Test;

import de.holisticon.javaspektrum.ngjee.utils.EmHelper;
import de.holisticon.javaspektrum.ngjee.utils.JPAHelper;

/**
 * This test checks basic
 * 
 * @author mreinhardt
 *
 */
public class PersistenceTest extends JPAHelper {

	/**
	 * just init the persistence and check for fundamental errors, like named
	 * query errors
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testBasicJpaViaHibernate() throws Exception {
		EmHelper.execute(new EmHelper.Runnable() {

			@Override
			public void execute(final EntityManager em) throws Exception {
				// method is left empty intentionally
			}
		}, em);
	}

}
