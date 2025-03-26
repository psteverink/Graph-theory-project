<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="start-parser">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>307 109 19 19</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>308 211 19 19</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>307 315 19 19</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>318 430 19 19</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Main</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>child</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Block</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>flag:first</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>flag:last</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>child</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:BlockStatement</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>flag:first</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>flag:last</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>child</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:LocalClassDeclaration</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>flag:first</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>flag:last</string>
            </attr>
        </edge>
    </graph>
</gxl>
