/*
 * Copyright 2011 Martin Grotzke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.javakaffee.web.msm;

/**
 * Represents two values, a tuple.
 * 
 * @author @author <a href="mailto:martin.grotzke@javakaffee.de">Martin Grotzke</a>
 */
public class Pair<A,B> {
	
	private final A _first;
	private final B _second;

	public Pair(final A first, final B second) {
		super();
		_first = first;
		_second = second;
	}

	public static <A, B> Pair<A, B> of( final A first, final B second ) {
		return new Pair<A, B>( first, second );
	}

	public A getFirst() {
		return _first;
	}

	public B getSecond() {
		return _second;
	}
	
}
