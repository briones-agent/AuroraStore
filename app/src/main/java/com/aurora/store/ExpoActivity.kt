/*
 * SPDX-FileCopyrightText: 2025 The Aurora Store Project
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.store

import android.os.Bundle
import com.aurora.store.brownfield.BrownfieldActivity
import com.aurora.store.brownfield.showReactNativeFragment

/**
 * Hosts the React Native screen shipped by the Expo brownfield AAR
 * (`com.aurora.store:aurorabrownfield-fused-release`).
 *
 * [BrownfieldActivity] extends AppCompatActivity and forwards configuration
 * changes; [showReactNativeFragment] mounts the RN root fragment (module "main")
 * and wires native back-button handling.
 */
class ExpoActivity : BrownfieldActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showReactNativeFragment()
    }
}
