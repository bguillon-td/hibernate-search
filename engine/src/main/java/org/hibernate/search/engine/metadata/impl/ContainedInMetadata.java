/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.engine.metadata.impl;

import org.hibernate.annotations.common.reflection.XMember;
import org.hibernate.search.util.impl.ReflectionHelper;

/**
 * @author Hardy Ferentschik
 */
public class ContainedInMetadata {

	private final XMember containedInMember;
	private final Integer maxDepth;

	public ContainedInMetadata(XMember containedInMember, Integer maxDepth) {
		this.containedInMember = containedInMember;
		ReflectionHelper.setAccessible( this.containedInMember );
		this.maxDepth = maxDepth;
	}

	public XMember getContainedInMember() {
		return containedInMember;
	}

	public Integer getMaxDepth() {
		return maxDepth;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder( "ContainedInMetadata{" );
		sb.append( "containedInMember=" ).append( containedInMember );
		sb.append( ", maxDepth=" ).append( maxDepth );
		sb.append( '}' );
		return sb.toString();
	}
}


