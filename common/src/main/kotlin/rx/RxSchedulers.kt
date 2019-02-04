/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.core.rx

import io.reactivex.Scheduler

/**
 * RxJava schedulers available to the app.
 */
class RxSchedulers(
  val io: Scheduler,
  val computation: Scheduler,
  val single: Scheduler,
  val main: Scheduler
)
