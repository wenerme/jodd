// Copyright (c) 2003-present, Jodd Team (http://jodd.org)
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice,
// this list of conditions and the following disclaimer.
//
// 2. Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package jodd.proxetta.fixtures.inv;

public class Replacer {

	public static int rInvVirtual(Object target, String what) {
		System.out.print("REPLACED VIRTUAL! " + target.getClass().getName() + " * " + what + '!');
		return 173;
	}

	public static int rInvStatic(String what, String owner, String methodName, String methodSignature, Class targetClass, Object clone) {
		System.out.print("REPLACED STATIC! " + what + " * " + owner + " * " + methodName + " * " + methodSignature + " * " + targetClass.getName() + " * " + clone.getClass().getName() + '!');
		return 137;
	}

	public static void rInvInterface(Object implementation, String what) {
		System.out.print("REPLACED INTERFACE! " + implementation + " * " + what + '!');
	}

	public static Two rInvNew() {
		return new Two();
	}

	public static Two rInvNew(String state) {
		return new Two("REPLACED " + state);
	}
}
