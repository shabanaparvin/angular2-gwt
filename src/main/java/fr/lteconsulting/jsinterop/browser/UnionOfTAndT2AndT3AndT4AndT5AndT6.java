package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>  {
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT(T value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T2 asT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT2(T2 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T3 asT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT3(T3 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T4 asT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT4(T4 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T5 asT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT5(T5 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T6 asT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2, T3, T4, T5, T6> UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6> ofT6(T6 value) {
        return Js.cast( value );
    }
    
}