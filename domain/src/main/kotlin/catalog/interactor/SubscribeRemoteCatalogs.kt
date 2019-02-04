/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.domain.catalog.interactor

import io.reactivex.Observable
import tachiyomi.domain.catalog.model.CatalogRemote
import tachiyomi.domain.catalog.repository.CatalogRepository
import javax.inject.Inject

class SubscribeRemoteCatalogs @Inject constructor(
  private val catalogRepository: CatalogRepository
) {

  fun interact(
    withNsfw: Boolean = true
  ): Observable<List<CatalogRemote>> {
    return catalogRepository.getRemoteCatalogsObservable()
      .map { catalogs ->
        if (withNsfw) {
          catalogs
        } else {
          catalogs.filter { !it.nsfw }
        }
      }
  }

}
