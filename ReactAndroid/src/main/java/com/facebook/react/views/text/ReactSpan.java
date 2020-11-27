/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.views.text;

/*
 * Enables us to distinguish between spans that were added by React Native and spans that were
 * added by something else. All spans that React Native adds should implement this interface.
 */
public interface ReactSpan {}
