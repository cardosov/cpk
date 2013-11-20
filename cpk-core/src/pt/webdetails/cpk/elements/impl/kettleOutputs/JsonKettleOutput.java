/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */
package pt.webdetails.cpk.elements.impl.kettleOutputs;

import java.util.Map;
import pt.webdetails.cpf.http.ICommonParameterProvider;
import pt.webdetails.cpf.utils.IPluginUtils;

/**
 *
 * @author Pedro Alves<pedro.alves@webdetails.pt>
 */
public class JsonKettleOutput extends KettleOutput {

    public JsonKettleOutput(Map<String, Map<String, Object>> bloatedMap,IPluginUtils plug) {
        super(bloatedMap,plug);
    }

    @Override
    public boolean needsRowListener() {
        return true;
    }

    @Override
    public void processResult() {
        super.processJson();
    }
}