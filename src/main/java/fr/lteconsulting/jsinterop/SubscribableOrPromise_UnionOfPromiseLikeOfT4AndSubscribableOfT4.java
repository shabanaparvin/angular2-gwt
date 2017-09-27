package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/angular4-api/tsd/rxjs/Observable.d.ts:522
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface SubscribableOrPromise_UnionOfPromiseLikeOfT4AndSubscribableOfT4<T4>  {
    @JsOverlay
    default PromiseLike<T4> asPromiseLikeOfT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T4> SubscribableOrPromise_UnionOfPromiseLikeOfT4AndSubscribableOfT4<T4> ofPromiseLikeOfT4(PromiseLike<T4> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T4> asSubscribableOfT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T4> SubscribableOrPromise_UnionOfPromiseLikeOfT4AndSubscribableOfT4<T4> ofSubscribableOfT4(Subscribable<T4> value) {
        return Js.cast( value );
    }
    
}