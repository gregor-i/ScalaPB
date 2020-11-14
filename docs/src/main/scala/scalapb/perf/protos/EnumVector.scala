// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.perf.protos

@SerialVersionUID(0L)
final case class EnumVector(
    colors: _root_.scala.Seq[scalapb.perf.protos.Color] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[EnumVector] {
    private[this] def colorsSerializedSize = {
      if (__colorsSerializedSizeField == 0) __colorsSerializedSizeField = {
        var __s: _root_.scala.Int = 0
        colors.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(__i.value))
        __s
      }
      __colorsSerializedSizeField
    }
    @transient private[this] var __colorsSerializedSizeField: _root_.scala.Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if(colors.nonEmpty) {
        val __localsize = colorsSerializedSize
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      if (colors.nonEmpty) {
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(colorsSerializedSize)
        colors.foreach((_output__.writeEnumNoTag _).compose((_: scalapb.perf.protos.Color).value))
      };
      unknownFields.writeTo(_output__)
    }
    def clearColors = copy(colors = _root_.scala.Seq.empty)
    def addColors(__vs: scalapb.perf.protos.Color*): EnumVector = addAllColors(__vs)
    def addAllColors(__vs: Iterable[scalapb.perf.protos.Color]): EnumVector = copy(colors = colors ++ __vs)
    def withColors(__v: _root_.scala.Seq[scalapb.perf.protos.Color]): EnumVector = copy(colors = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => colors.iterator.map(_.javaValueDescriptor).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(colors.iterator.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.perf.protos.EnumVector
}

object EnumVector extends scalapb.GeneratedMessageCompanion[scalapb.perf.protos.EnumVector] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.perf.protos.EnumVector] = this
  def merge(`_message__`: scalapb.perf.protos.EnumVector, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.EnumVector = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.perf.protos.EnumVector] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.perf.protos.EnumVector(
        colors = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scalapb.descriptors.EnumValueDescriptor]]).getOrElse(_root_.scala.Seq.empty).iterator.map(__e => scalapb.perf.protos.Color.fromValue(__e.number)).toSeq
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProtosProto.javaDescriptor.getMessageTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProtosProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => scalapb.perf.protos.Color
    }
  }
  lazy val defaultInstance = scalapb.perf.protos.EnumVector(
    colors = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __colors: collection.mutable.Builder[scalapb.perf.protos.Color, _root_.scala.Seq[scalapb.perf.protos.Color]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.perf.protos.EnumVector] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __colors += scalapb.perf.protos.Color.fromValue(_input__.readEnum())
          case 10 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __colors += scalapb.perf.protos.Color.fromValue(_input__.readEnum())
            }
            _input__.popLimit(oldLimit)
          }
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.perf.protos.EnumVector = {
      scalapb.perf.protos.EnumVector(
          colors = __colors.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.perf.protos.EnumVector, scalapb.perf.protos.EnumVector.Builder] {
    def apply(): Builder = new Builder(
      __colors = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.perf.protos.Color],
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.perf.protos.EnumVector): Builder = new Builder(
      __colors = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.perf.protos.Color] ++= _message__.colors,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.perf.protos.EnumVector.Builder()
  def newBuilder(a: scalapb.perf.protos.EnumVector): Builder = scalapb.perf.protos.EnumVector.Builder(a)
  implicit class EnumVectorLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.EnumVector]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.perf.protos.EnumVector](_l) {
    def colors: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[scalapb.perf.protos.Color]] = field(_.colors)((c_, f_) => c_.copy(colors = f_))
  }
  final val COLORS_FIELD_NUMBER = 1
  def of(
    colors: _root_.scala.Seq[scalapb.perf.protos.Color]
  ): _root_.scalapb.perf.protos.EnumVector = _root_.scalapb.perf.protos.EnumVector(
    colors
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.perf.EnumVector])
}
