import React, { Component, PropTypes } from 'react';
import { NativeModules, requireNativeComponent, View, Text, } from 'react-native';

class RichEditorViewComponent extends Component{
constructor(props)
{
    super(props)
}

render()
{

    return <RichEditorView {...this.props}/>
}

}

RichEditorViewComponent.propTypes=
{

    ...View.propTypes,
}

const RichEditorView = requireNativeComponent('RichEditorView', RichEditorViewComponent, {
	nativeOnly: { 
		onChange: true,
	},
});

console.log('editorviewaaa',RichEditorView)
export default RichEditorView;

// var iface = {
//     name: 'RichEditorView',
//     PropTypes: {
//         ...View.propTypes // include the default view properties
//     }
// }

// module.exports = requireNativeComponent('RichEditorView', iface);