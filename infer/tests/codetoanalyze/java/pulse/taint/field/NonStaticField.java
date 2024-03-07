/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

public class NonStaticField {

  Object secret;

  Object sourceField;
  Object sinkField;

  /** should report on these tests */
  void instanceFieldBad() {
    this.secret = this.sourceField;
    this.sinkField = this.secret;
  }
}
