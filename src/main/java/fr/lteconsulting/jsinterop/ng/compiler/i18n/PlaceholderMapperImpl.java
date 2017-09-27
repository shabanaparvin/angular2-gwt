package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer".PlaceholderMapper
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts:654

  * A `PlaceholderMapper` converts placeholder names from internal to serialized representation and
  * back.
  * 
  * It should be used for serialization format that put constraints on the placeholder names.
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="PlaceholderMapper")
public class PlaceholderMapperImpl implements PlaceholderMapper
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(toInternalName,1,,P(d1))
      * TE Signature : S(toInternalName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@963
     */
    public native String toInternalName(String publicName);
    /** 
      * Std Signature : S(toPublicName,1,,P(d1))
      * TE Signature : S(toPublicName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@908
     */
    public native String toPublicName(String internalName);
}