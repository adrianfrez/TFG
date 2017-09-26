// Generated from com/memorization/interprete/memorization.g4 by ANTLR 4.5.1
package com.memorization.interprete;
	
	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link memorizationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface memorizationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link memorizationParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(memorizationParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(memorizationParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(memorizationParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(memorizationParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(memorizationParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(memorizationParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typesProtection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesProtection(memorizationParser.TypesProtectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(memorizationParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(memorizationParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(memorizationParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(memorizationParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(memorizationParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(memorizationParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(memorizationParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(memorizationParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(memorizationParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(memorizationParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(memorizationParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(memorizationParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(memorizationParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(memorizationParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#memorizationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemorizationDeclaration(memorizationParser.MemorizationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#startMemorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartMemorization(memorizationParser.StartMemorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeOfLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfLabels(memorizationParser.TypeOfLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(memorizationParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(memorizationParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#methodTypeOfReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodTypeOfReturn(memorizationParser.MethodTypeOfReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#methodThrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodThrows(memorizationParser.MethodThrowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(memorizationParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(memorizationParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(memorizationParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(memorizationParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(memorizationParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(memorizationParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(memorizationParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(memorizationParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(memorizationParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(memorizationParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(memorizationParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(memorizationParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(memorizationParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(memorizationParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(memorizationParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(memorizationParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(memorizationParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#primitivesTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivesTypes(memorizationParser.PrimitivesTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(memorizationParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(memorizationParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(memorizationParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(memorizationParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(memorizationParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(memorizationParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(memorizationParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(memorizationParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(memorizationParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(memorizationParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(memorizationParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(memorizationParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(memorizationParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(memorizationParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(memorizationParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(memorizationParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(memorizationParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(memorizationParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(memorizationParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(memorizationParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(memorizationParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(memorizationParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(memorizationParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(memorizationParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(memorizationParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(memorizationParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(memorizationParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(memorizationParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(memorizationParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(memorizationParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(memorizationParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(memorizationParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(memorizationParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(memorizationParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(memorizationParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(memorizationParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(memorizationParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(memorizationParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(memorizationParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(memorizationParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(memorizationParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(memorizationParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(memorizationParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(memorizationParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(memorizationParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(memorizationParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(memorizationParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(memorizationParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(memorizationParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(memorizationParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(memorizationParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(memorizationParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(memorizationParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(memorizationParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(memorizationParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(memorizationParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(memorizationParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(memorizationParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(memorizationParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(memorizationParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(memorizationParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link memorizationParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(memorizationParser.ArgumentsContext ctx);
}